plugins {
    java
}

group = project.property("module-group") as String
version = project.property("module-version") as String

repositories {
    mavenCentral()
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    compileOnly(libs.bundles.polocloud)
    //compileOnly(fileTree("./libs") { include("*.jar") })
}

tasks.jar {
    archiveFileName.set("${project.property("module-name") as String}-${project.version}.jar")
}
