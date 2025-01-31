# CCHDesignPatternsTemplateMethod

Universidade Tecnológica Federal do Paraná
Engenharia de Software - Curso de Arquitetura de Software (AS27S)
INSTRUTOR: Prof. Dr. Gustavo Santos
Lais Maruyama Domingos, 2409917

CCH - Design Patterns Template Method

# Problema
Duplicação de código em algoritmos que seguem a mesma estrutura, mas possuem variações em alguns passos. Ele permite padronizar o fluxo de execução e garantir que as subclasses implementem apenas os detalhes específicos, sem modificar a estrutura geral do algoritmo.
Descrição da Solução
Definir o esqueleto de um algoritmo em uma operação, postergando alguns passos para as subclasses. Template Method permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo.


# Visão Geral Processamento de Arquivos

A classe ArquivoProcessador é abstrata e define o método template (processarArquivo), que estabelece a sequência fixa do processo.
Os métodos lerDados, processarDados e salvarArquivo são abstratos, e cada subclasse fornece sua própria implementação.
As subclasses (ProcessadorCSV, ProcessadorJSON, ProcessadorXML) implementam os métodos abstratos de acordo com o formato específico do arquivo.
O método processarArquivo() garante que todas as etapas sejam executadas na ordem correta, sem permitir mudanças na estrutura.

# Consequências [vantagens e desvantagens]
## Vantagens
### Reutilização de Código
- Evita duplicação, pois a lógica comum fica na classe abstrata.
- Subclasses implementam apenas as partes variáveis.
### Facilita a Manutenção
- Alterações na estrutura do algoritmo são feitas na classe-mãe, sem afetar as subclasses.
- Reduz o risco de inconsistências entre subclasses.
### Inversão de Controle ("Princípio de Hollywood")
- A superclasse controla a execução, chamando métodos específicos das subclasses.
- Evita que as subclasses precisem gerenciar a ordem de execução.
### Extensibilidade
- Subclasses podem estender apenas as partes necessárias do algoritmo.
- Métodos gancho permitem personalização sem sobrescrever toda a lógica.
### Melhor Organização do Código
- Separa o que é fixo (na superclasse) do que é variável (nas subclasses).
- Promove um design mais modular e estruturado.

## Desvantagens
### Dificuldade na Compreensão
- Pode ser difícil para novos desenvolvedores entenderem a relação entre superclasse e subclasses.
- Requer um bom entendimento da hierarquia de classes.
### Rigidez no Fluxo de Execução
- Como a sequência do algoritmo é definida na superclasse, mudanças na ordem podem ser complexas.
- Pode limitar a flexibilidade quando o comportamento precisa ser muito diferente entre subclasses.
### Possível Viés no Design
- Se o método-template não for bem projetado, pode forçar subclasses a implementar métodos desnecessários.
- Excesso de métodos abstratos pode gerar subclasses muito complexas.
### Acoplamento Entre Superclasse e Subclasses
- Se a superclasse mudar, todas as subclasses podem ser impactadas.
- Pode ser difícil refatorar se a hierarquia crescer muito.
### Dificuldade em Implementar Múltiplos Níveis de Abstração
- Se houver muitas camadas de herança, o código pode ficar confuso e difícil de depurar.


