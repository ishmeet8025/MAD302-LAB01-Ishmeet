# MAD302-01 Android Development  
## LAB 01 – ProfileListApp  

---

### 👤 Student Information

**Name:** Ishmeet Singh  
**Student ID:** A00202436  
**Course:** MAD302-01 Android Development  
**Lab Number:** Lab 01  
**Submission Date:** 2026-02-14  

---

## 📌 Project Overview

ProfileListApp is a simple Android application developed using Kotlin in Android Studio.

The application allows users to:

- Enter a Name
- Enter an Age
- Add the profile to a list
- Display all added profiles on the screen

The app also demonstrates Android Activity lifecycle logging.

This lab focuses on understanding:
- Kotlin data classes
- Mutable lists
- Button click handling
- Basic UI components
- For loop iteration
- Android Activity lifecycle methods
- Logging using Log.d()

---

## 📱 Application Features

### 1️⃣ Single Screen Application
- Only one Activity: **MainActivity**

### 2️⃣ User Interface Components
The layout (activity_main.xml) includes:

- EditText → Enter Name
- EditText → Enter Age
- Button → Add Profile
- TextView → Display Profiles

The layout uses a vertical LinearLayout.

---

## 🧩 Data Class

File: `Profile.kt`

```kotlin
data class Profile(
    val name: String,
    val age: Int
)
