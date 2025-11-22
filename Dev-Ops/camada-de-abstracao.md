# Camada de Abstração
## Rede
- Visa facilitar a comunicação entre diferentes serviços e componentes de uma aplicação distribuída.
- Todo container tem uma rede
- Bridge (padrão): containers na mesma bridge podem se comunicar
- Host: container usa a rede do host diretamente
- Quando for trabalahar com múltiplos containers, é recomendado criar redes customizadas para melhor controle e isolamento.
- Agrupamento de containers escopados por rede
### Duas formas de associar containers a redes:
- **Docker Network Create:** Cria uma rede customizada (bridge, overlay, macvlan, etc.)
- **Docker Compose:** Define redes no arquivo docker-compose.yml para orquestrar múltiplos containers
### Comandos úteis:
- `docker network ls`: Lista redes existentes
- `docker network inspect <network_name>`: Mostra detalhes de uma rede específica
- `docker network connect <network_name> <container_name>`: Conecta um container a uma rede
- `docker network disconnect <network_name> <container_name>`: Desconecta um container de uma rede
## Volume
- Separação de responsabilidades entre dados e containers
- 