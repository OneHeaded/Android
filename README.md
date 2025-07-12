# Tic-Tac-Toe Android App

A simple Tic-Tac-Toe game built for Android using Java and Android Studio.

## Overview

This project implements a classic 3x3 Tic-Tac-Toe game where two players take turns marking spaces with "X" or "O". The game detects wins, draws, and includes a reset feature to start a new game. The app features a clean user interface with a grid layout and a reset button.

## Features

- Two-player gameplay with alternating "X" and "O" turns
- Win detection for rows, columns, and diagonals
- Draw detection when the board is full
- Reset button to start a new game
- Toast notifications for game outcomes (win or draw)
- Simple and intuitive UI with a 3x3 grid and reset button

## Project Structure

- **`MainActivity.java`**: The main Java file containing the game logic, handling button clicks, win conditions, and reset functionality.
- **`activity_main.xml`**: The XML layout file defining the UI, including a 3x3 grid of buttons, a title TextView, and a reset button.
- **Package**: `com.example.tictak`

## Prerequisites

- Android Studio (latest version recommended)
- Android SDK
- Minimum API level: 21 (Android 5.0 Lollipop)
- Java 8 or higher

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/OneHeaded/Tic-Tac-Toe.git
   ```
2. Open the project in Android Studio.
3. Sync the project with Gradle.
4. Build and run the app on an emulator or physical Android device.

## How to Play

1. Launch the app on an Android device or emulator.
2. Players take turns tapping an empty cell in the 3x3 grid to place their mark ("X" or "O").
3. The game checks for a winner after each move (minimum 5 moves).
4. A toast message displays the winner ("X" or "O") or declares a draw if all cells are filled.
5. Tap the "Reset" button to clear the board and start a new game.

## Files Description

- **`MainActivity.java`**:
  - Initializes the game board with 9 buttons and a reset button.
  - Handles button clicks to place "X" or "O" based on the current player's turn.
  - Checks for win conditions (rows, columns, diagonals) or a draw after 5 or more moves.
  - Resets the game when the reset button is clicked.

- **`res/layout/activity_main.xml`**:
  - Defines the UI layout with a vertical LinearLayout.
  - Contains a TextView for the game title, a 3x3 GridLayout for the game board, and a reset button.
  - Uses `AppCompatButton` for compatibility and custom background tint for styling.

## Dependencies

- AndroidX AppCompat library for backward compatibility.
- Standard Android SDK components (no additional external libraries required).

## Notes

- The game assumes a single-device, two-player setup with no AI opponent.
- The UI uses a fixed button size (50dp x 50dp) and a custom background tint (`@color/col3`) for the grid buttons.
- The reset button uses a distinct color (`#0091EA`) for visibility.
- Ensure the `@string/game` and `@string/reset` resources are defined in `res/values/strings.xml`:
  ```xml
  <string name="game">Tic Tac Toe</string>
  <string name="reset">Reset</string>
  ```

## Future Improvements

- Add single-player mode with AI opponent.
- Implement score tracking for multiple games.
- Enhance UI with animations or sound effects.
- Support different board sizes (e.g., 4x4).

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.