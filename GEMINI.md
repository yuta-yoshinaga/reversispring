# GEMINI.md
This file provides guidance to GEMINI when working with code in this repository.

## Commands

- **Build the project:**
  ```bash
  ./mvnw clean install
  ```

- **Run the application:**
  ```bash
  ./mvnw spring-boot:run
  ```

- **Run tests:**
  ```bash
  ./mvnw test
  ```

## Code Architecture

This is a Spring Boot application that implements the backend for a Reversi game.

- The main application entry point is `src/main/java/jp/gr/java_conf/yuta_yoshinaga/reversi/ReversispringApplication.java`.
- The core game logic is likely located in `src/main/java/jp/gr/java_conf/yuta_yoshinaga/reversi/model/`.
- The application exposes a REST API for the frontend to interact with. The controllers are in `src/main/java/jp/gr/java_conf/yuta_yoshinaga/reversi/controller/`.
- The application uses session management to maintain the state of the game.

## Usage Notes

- The frontend notifies the backend of the coordinates of the clicked square.
- The backend responds with whether the move is valid and the resulting state of the board.
- The board state is stored in the session.
- GUI settings are stored in the browser's Web Storage and sent to the server when a game starts.
