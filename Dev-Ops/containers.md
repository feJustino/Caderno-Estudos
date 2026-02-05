

# Containers: Conceitos, Tecnologias e Prática

## 1. O que é um Container?

- Ambiente isolado que contém todas as dependências necessárias para executar uma aplicação
- Compartilha o kernel do host, mas isola processos, recursos e arquivos
- Permite executar múltiplos containers de forma independente no mesmo host
- Analogia: navio cargueiro (host) transportando vários containers (aplicações isoladas)
- Se um container falha, não afeta os demais nem o host
- Responsabilidade única: cada container executa um serviço ou aplicação específica

## 2. Tecnologias de Containerização

- **LXC (Linux Containers):**
    - Primeira tecnologia popular de containers no Linux
    - Open-source, baseada em recursos nativos do kernel
    - CLI para gerenciamento
    - Isolamento próximo ao de uma VM, mas mais leve
- **Docker:**
    - Interface mais amigável e popular para containers
    - Não é a única tecnologia, mas é a mais difundida
- **Outras interfaces:**
    - Podman
    - Containerd
    - LXD

## 3. Containers vs. Máquinas Virtuais (VMs)

- Containers não possuem sistema operacional completo próprio; compartilham o kernel do host
- Máquinas virtuais (VMs) possuem sistema operacional completo e virtualizam hardware
- Containers são mais leves (imagens em MB), VMs são mais pesadas (imagens em GB)
- Em VMs, tudo roda na mesma máquina virtual: se ela cai, tudo para; containers são independentes



## 4. Máquinas Virtuais (VMs)

- Virtualizam hardware e rodam sistemas operacionais completos
- Maior consumo de recursos (CPU, memória, disco)
- Imagens geralmente ocupam vários GB
- Dependentes do sistema operacional instalado na VM
- Se a VM falha, todos os serviços nela param



## 5. Docker

- Surgiu em 2013
- Escrito em Go
- Plataforma para criar, gerenciar e executar containers
- Utiliza recursos do kernel Linux (namespaces, cgroups) para isolar processos
- Baseado em imagens:
    - Imagem: arquivo declarativo com tudo que a aplicação precisa (dependências, configurações, etc.)
    - Facilita portabilidade e versionamento
    - Permite criar ambientes idênticos em diferentes servidores
- Facilita o ciclo de entrega e integração contínua
- Independente do servidor físico (pode rodar em qualquer lugar que suporte Docker)
- Vantagem: ambiente local idêntico ao de produção graças ao uso de imagens


## 6. Princípios de Isolamento em Containers

- **CGroups:**
    - Controla e limita recursos de processos (CPU, memória, etc.)
    - Implementado no kernel do Linux
- **Namespaces:**
    - Isolamento de recursos (processos, rede, usuários, etc.)
- **Unshare:**
    - Cria um novo namespace para execução isolada de processos
- O objetivo é isolar recursos e processos entre containers


## 7. OCI (Open Container Initiative)


#### O principal objetivo da Open Container Initiative (OCI) é definir padrões abertos para garantir a portabilidade e a interoperabilidade entre diferentes tecnologias de containers, promovendo containers agnósticos e compatíveis em qualquer ambiente.

- Estrutura de governança open-source
- Facilita a interoperabilidade entre diferentes tecnologias de container
- Define padrões para runtime, imagens e distribuição
- Exemplo: runc

**Objetivos:**
- Promover containers agnósticos
- Garantir portabilidade



## 8. Docker na Prática

- Site oficial: https://www.docker.com/
- Excelente desempenho, escalabilidade e portabilidade
- Grande comunidade e suíte de ferramentas
- Permite armazenar containers em nuvem
- Docker Desktop: interface gráfica para gerenciamento local
- Docker Hub: repositório online oficial para armazenar, compartilhar e distribuir imagens de containers Docker

### Conceitos Importantes
- **Containers:**
    - Instância de execução de uma imagem
    - Criado ao rodar uma imagem
    - Por padrão, é efêmero (não persiste dados após ser removido)
- **Imagens:**
    - Modelo imutável, somente leitura
    - Define como o container será montado ("receita de bolo")
- **Volumes:**
    - Permitem persistência de dados entre execuções de containers
- **Builds:**
    - Processo de criação de uma imagem a partir de um Dockerfile
- **Dev Environment:**
    - Ambientes de desenvolvimento isolados usando containers
- **Docker Scout:**
    - Ferramenta para análise de segurança e boas práticas

### Comandos CLI Básicos
- `docker -v` — mostra a versão do Docker
- `docker image ls` — lista imagens disponíveis
- `docker image rm <id>` — remove imagem
- `docker container ls` — lista containers em execução
- `docker container rm <id>` — remove container
- `docker build` — cria imagem
- `docker run` — executa imagem

## 9. Volumes em Docker

### **Imagens de Containers são Efêmeras — O que isso significa?**

Quando trabalhamos com containers, precisamos entender que **as imagens e os próprios containers são efêmeros**. Isso quer dizer que qualquer alteração feita **dentro** de um container em execução **não é preservada** quando ele é destruído ou recriado.

Por exemplo:
Se você acessar o container e criar um arquivo manualmente — seja uma foto, um PDF, um log ou qualquer outro tipo de dado — esse arquivo **não fará parte da imagem original**. Portanto, ao rebuildar a imagem ou recriar o container, **tudo que não está definido no processo de build será perdido**.

É aí que entram os **volumes**.
Eles permitem que você **persista dados** mesmo que o container seja removido. Assim, sua aplicação pode continuar armazenando informações importantes sem depender do filesystem interno do container.

**Em resumo:**

* O conteúdo interno do container *não persiste* após sua remoção.
* Para garantir persistência de dados, utilizamos **volumes**.
* Volumes permitem que dados importantes sobrevivam a rebuilds, reinicializações e recriações dos containers.

-**docker exec -it <container_id> /bin/bash** - Acessa o terminal do container em execução; Acesso ao sistema de arquivos do container

### **O que é um Volume no Docker e por que ele é necessário?**

Podemos entender um **volume** como um diretório **externo ao container**, independente dele. Isso é importante porque, por padrão, um container é **volátil e efêmero**. Ou seja, tudo aquilo que criamos dentro do container — arquivos, logs, imagens, PDFs — **se perde** assim que o container é reiniciado, destruído ou recriado.

É por isso que, no exemplo em que criamos um arquivo dentro do container e depois demos um *restart*, o arquivo simplesmente desapareceu:
**não havia nenhum volume persistente associado**, então o filesystem interno foi completamente descartado, como esperado.

É exatamente para resolver esse problema que existe o conceito de **volume persistente**.
Quando precisamos manter dados mesmo após a recriação do container, utilizamos volumes para associar esse conteúdo a um local que **não depende da vida do container**.

No Docker, trabalhamos com isso por meio do comando:

```
docker volume
```

Esse comando permite criar, listar, inspecionar e gerenciar volumes, garantindo que os dados persistam independentemente do ciclo de vida do container.

-**docker volume ls** - Lista volumes criados
-**docker volume create <nome_do_volume>** - Cria um volume
