#!/bin/bash

echo "Iniciando base de datos con Docker..."
docker-compose -f data-base.yml up -d

