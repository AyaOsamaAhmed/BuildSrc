object Deps {
      val core = "androidx.core:core-ktx:${Version.core}"
    val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
    val materialDesign="com.google.android.material:material:${Version.material}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    val junit = "junit:junit:${Version.jUnit}"
    val testExt = "androidx.test.ext:junit:${Version.testExt}"
    val testEspresso = "androidx.test.espresso:espresso-core:${Version.testEspresso}"
    val kotlin ="org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val timber="com.jakewharton.timber:timber:${Version.timber}"
}

object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Version.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}" }
}
