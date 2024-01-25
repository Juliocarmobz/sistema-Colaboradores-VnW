
# Projeto de Gerenciamento de Colaboradores

Este projeto Java oferece uma estrutura flexível para gerenciar informações de colaboradores em uma empresa de tecnologia. Ele proporciona uma abordagem organizada para a inclusão de novos membros da equipe, além de permitir a inserção eficiente de dados pessoais, informações salariais e a comparação das tecnologias associadas a diferentes cargos.

![DiagramaClassesTarefa](https://github.com/Juliocarmobz/sistema-Colaboradores-VnW/assets/138674611/4e226fa4-217f-4b65-ad8c-40269047e6a3)

## Funcionalidades

1. Inclusão de Colaboradores:

- O projeto permite a fácil inclusão de novos colaboradores, fornecendo uma base sólida para o gerenciamento de informações pessoais e salariais.

2. Gerenciamento de Dados:
- Os colaboradores são representados por objetos da classe **'Colaborador'**, que contêm atributos como nome, CPF, salário, status ativo/inativo e data de admissão.

3. Comparação de Tecnologias:
- O projeto introduz a comparação de tecnologias associadas a diferentes cargos. As subclasses **'DevBackEnd'**, **'DevFrontEnd'**, **'Designer'** e **'TechLeader'** ajustam requisitos técnicos com base nas demandas específicas de seus campos de atuação.

4. Aumento Salarial:
- As subclasses implementam o método **'aumentarSalario()'**, permitindo ajustes salariais específicos para cada tipo de desenvolvedor.

5. Visualização de Informações:
- O método **'vizualizar()'** na classe **'Colaborador'** fornece uma representação visual das informações do colaborador, incluindo nome, CPF, salário e status ativo/inativo.

6. Verificação de Tecnologias:
- O método **'tecnologias()'** nas subclasses verifica se a tecnologia associada ao colaborador é válida para o tipo de desenvolvedor correspondente.

## Como Utilizar

1. Inclusão de Colaboradores:

- Crie instâncias das subclasses **'DevBackEnd'** e **'DevFrontEnd'**, fornecendo os parâmetros necessários, como nome, CPF, salário e tecnologia.

2. Visualização de Informações: 
- Utilize o método **'vizualizar()'** para obter uma representação visual das informações de um colaborador.

3. Aumento Salarial:
- Chame o método **'aumentarSalario()'** nas subclasses para aplicar aumentos salariais específicos.

4. Verificação de Tecnologias:
- Chame o método **'tecnologias()'** nas subclasses para verificar se a tecnologia associada ao colaborador é válida para o tipo de desenvolvedor correspondente.

## Contribuições

Contribuições para aprimorar e expandir este projeto são bem-vindas. Sinta-se à vontade para fazer fork, criar pull requests ou reportar problemas.


## Licença



