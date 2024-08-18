# README.md Sample for interview test

## Overview

This is sample of my recently go project structure and not relate to this test project for interview.

## Project Structure

The project is organized as follows:
```plaintext
your_project/
├── .github/
│   └── workflows/
│       └── ci.yml      
├── .env
├── .gitignore
├── README.md
├── go.mod
├── go.sum
├── app/
│   ├── main.go
│   ├── config/
│   │   └── config.go
│   ├── db/
│   │   ├── connection.go
│   │   ├── models/
│   │   │   ├── sample_a.go
│   │   │   └── sample_b.go
│   │   ├── repositories/
│   │   │   ├── sample_a_repository.go
│   │   │   └── sample_b_repository.go
│   │   └── migrations/
│   │       ├── 001_create_sample_a_table.up.sql
│   │       ├── 001_create_sample_a_table.down.sql
│   │       ├── 002_create_sample_b_table.up.sql
│   │       └── 002_create_sample_b_table.down.sql
│   ├── handlers/
│   │   ├── handler_a.go
│   │   └── handler_b.go
│   ├── router/
│   │   ├── router.go
│   │   └── middlewares/
│   │       └── middleware.go
│   ├── log/
│   │   └── logger.go
│   └── utils/
│       └── utils.go
├── build/
│   ├── docker/
│   │   └── Dockerfile
├── scripts/
│   ├── migrate.sh
│   ├── run_tests.sh
│   └── start_server.sh
└── tests/
    └── integration_test.go