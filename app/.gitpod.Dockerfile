FROM gitpod/workspace-full

# Instale o PostgreSQL
RUN sudo apt-get update && \
    sudo apt-get install -y postgresql postgresql-contrib
