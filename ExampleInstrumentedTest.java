plugins {
    id 'com.android.application'
}

android {
    namespace 'com.braveask.app'
    compileSdk 34

    defaultConfig {
        applicationId "com.braveask.app"
        minSdk 24
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    sourceSets {
        main {
            res.srcDirs = ['src/main/res']
            res.filter.exclude "mipmap-*/ic_launcher.xml"
            res.filter.exclude "mipmap-*/ic_launcher_round.xml"
        }
    }
}

dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.1.0'
}