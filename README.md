# springyReact on Whale

## Overview

This project combines the Java Spring Boot framework for the backend with React for the frontend. It demonstrates the capability to Dockerize both components individually using Docker containers or as a single application using Docker Compose.

## Features

- **Backend**: Utilizes Java Spring Boot framework.
- **Frontend**: Built with React.
- **Dockerization**:
  - Individual Docker containers for backend and frontend.
  - Docker Compose for running both as a single application.
  - Dockerfile provided in the root to serve React as a static file.

## Purpose

The primary goal of this project is to gain practical experience with Docker, showcasing the ability to containerize both backend and frontend components of a web application.

## Setup

### Prerequisites

- Docker installed on your machine.

### Running the Application

#### Docker Compose (for development)

To run both backend and frontend together:

```bash
docker-compose up
```

#### Individual Docker Containers

For separate deployment:

1. **Backend**:
   ```bash
   docker build -t backend-image ./backend
   docker run -d -p 8080:8080 backend-image
   ```

2. **Frontend**:
   ```bash
   docker build -t frontend-image ./frontend
   docker run -d -p 3000:3000 frontend-image
   ```

#### Running as a Single App (serving React as static files)

To build and run the combined application:

```bash
docker build -t combined-app .
docker run -d -p 80:80 combined-app
```

Access the application at `http://localhost:80`.
