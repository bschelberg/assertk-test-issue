plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.0"
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.23.1")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")
}

tasks.test {
    useJUnitPlatform()
}
