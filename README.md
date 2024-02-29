# Hogwarts Houses

## Overview

This project involves building Web APIs in Spring for Hogwarts School of Witchcraft and Wizardry. It enables the management of rooms and students within the castle, providing endpoints for creating, updating, and retrieving rooms, as well as assigning students to their respective rooms.

## Features

- Build Web APIs in Spring.
- Build DAOs.

## Endpoints

- `GET /rooms`: Retrieve a list of all rooms.
- `POST /rooms`: Add a new room.
- `GET /rooms/{roomId}`: Retrieve a specific room by ID.
- `DELETE /rooms/{roomId}`: Delete a room by ID.
- `PUT /rooms/{roomId}`: Update a room by ID.
- `GET /rooms/available`: Retrieve a list of available rooms.
- `GET /rooms/rat-owners`: Retrieve a list of rooms without cats or owls.

## Setup

1. Clone the project repository.
2. Ensure that Maven is installed.
3. Build the project using Maven: `mvn clean install`.
4. Run the project.

## Usage

1. Use the provided endpoints to manage rooms and students at Hogwarts.

