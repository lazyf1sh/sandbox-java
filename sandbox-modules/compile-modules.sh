#!/usr/bin/env bash
javac -d target --module-source-path modules $(find modules -name "*.java")
