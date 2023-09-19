plugins {
    java
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "com.onboard"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.data:spring-data-rest-hal-explorer")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("com.mysql:mysql-connector-j")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    //queryDSL설정
    implementation("com.querydsl:querydsl-jpa")
    implementation("com.querydsl:querydsl-core")
    implementation("com.querydsl:querydsl-collections")
    implementation("javax.persistence:javax.persistence-api:2.2")


    annotationProcessor("javax.persistence:javax.persistence-api:2.2")//ChatGPT 수정 추가
    //annotationProcessor("jakarta.persistence:jakarta.persistence-api")//java.lang.NoclassDefFoundError (javax.annotation.Entity) 대응 코드
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")//java.lang.NoClassDefFoundError (javax.annotation.Generated) 대응 코드
    annotationProcessor("com.querydsl:querydsl-apt:${dependencyManagement.importedProperties["querydsl.version"]}:jpa")// querydsl JPAAnnotationProcesson





}

tasks.withType<Test> {
    useJUnitPlatform()
}




//Quearydsl 설정부, Qclass를 꺼내기 위해 작성
//IntelliJ에서만 발생하는 문제로, 작성된 qclass들이 자동으로 build 디렉토리로 이전되기 때문에 작성함.
//Idle의 build영역과 Gradle의 build영역에 중복 스캔이 발생. Idle이 처음 build진행한 뒤, Gradle이 build를 진행하며, 중복 문제가 발생.
//build디렉토리만 아니면 됨.

val generated: String = "src/main/generated"

//querydsl QClass 파일 생성 위치를 지정
tasks.withType<JavaCompile>().configureEach {
    options.generatedSourceOutputDirectory.set(file(generated))
}

// java source set 에 querydsl QClass 위치 추가
sourceSets {
    main {
        java {
            srcDir(generated)
        }
    }
}


// gradle clean 시에 QClass 디렉토리 삭제
tasks.clean {
    delete(file(generated))
}
