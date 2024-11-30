plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)

    alias(libs.plugins.kotlinSerialization).apply(false) // Make sure you have this alias defined in your libs.versions.toml

    alias(libs.plugins.sqldelight).apply(false)

}
