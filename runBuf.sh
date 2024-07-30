#!/bin/sh
DOCKER=$(command -v podman || command -v docker)

$DOCKER run -v "$(pwd):/workspace" --workdir /workspace bufbuild/buf generate buf.build/project-kessel/relations-api:67b1cd9b6c954e10b6da430958fd90a7