# Compose-Navigation-Demo

A simple Jetpack Compose project demonstrating how to navigate between multiple screens using the Navigation component. It showcases modern practices for handling screen transitions and passing data in a clean and modular Android architecture.

---

## Overview

This project focuses on Jetpack Compose Navigation, one of the core features needed in every real-world Android app. It helps in organizing app flow, handling user actions, and passing data between composables efficiently.

---

## Project Structure

```
Navigation By Aman Sharma

├── ui/
│   ├── theme/
│   │   ├── Color.kt
│   │   ├── Theme.kt
│   │   └── Type.kt
│   ├── HomeScreen.kt
│   └── DetailScreen.kt
├── NavGraph.kt
└── MainActivity.kt
```

---

## What This App Does

- Accepts user input on the Home screen
- Navigates to the Detail screen using Jetpack Compose Navigation
- Passes the entered data between screens using route arguments
- Handles UI state using `remember` and `mutableStateOf`

---

## How Navigation Works

- `NavController` manages navigation and the back stack
- `NavHost` defines the routes and connects them to Composable screens
- Arguments are passed using route placeholders like `detail/{user}`
- Arguments are retrieved via `backStackEntry.arguments`

---

## Features You Can Add

- Animated transitions between screens using Accompanist
- Deep linking and nested navigation graphs
- Shared ViewModels across screens using Hilt
- Data class passing with serialization or Parcelable
- Bottom navigation or drawer layout integration

---

## How To Run

1. Clone the repository:

   ```bash
   git clone https://github.com/engineer-aman-sharma/Compose_Navigation_Demo
   ```

2. Open the project in Android Studio

3. Run the app on an emulator or physical device

4. Enter text and navigate to see data passed to the next screen

---

## Libraries Used

- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
- [Material 3](https://developer.android.com/jetpack/androidx/releases/compose-material3)

---

## Author

**Aman Sharma**  
Android Developer | Jetpack Compose | Kotlin  

[Email](mailto:officialprofin@gmail.com)  
[LinkedIn](https://in.linkedin.com/in/engineer-aman-sharma)
