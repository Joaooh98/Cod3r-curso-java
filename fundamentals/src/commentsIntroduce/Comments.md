Usar comentarios em um codigo nem sempre e indicado, porque acaba poluido muito a leitura e visibilidade do do codigo, 

Segundo alguns desenvolvedores e livros(codigo limpo), comentarios deve ser usando em extrema necessidade.

 a linguagem Java fornece três formas diferentes de escrever comentários sendo elas:
        // -> Comentário de uma única linha

        /* 
        * Comentário longo com mais
        * de uma linha 
        */

        /**
        * Javadoc
        * Javadoc é um utilitário do pacote de desenvolvimento Java
        * utilizado para a criação de um documento HTML com todos os métodos e
        * atributos das classes contidas em seu projeto.
        */

        para criar esse documento html e necessario executar um comando no terminal,
        do diretório que contém os arquivos-fonte execute o comando:        
            javadoc -d dirDoc nomeDoPacote


  traduzindo para ingles 

  using comments in code is not always recommended because it ends up polluting code readbility and visibility.

  According to some developers and books(clean code), comments should be used when absolutely necessary. 

  the Java language provides three different ways of writing comments: 
        
        // -> Single line comment

        /*
        * Long comment with more 
        * one line
        */

        /**
        * Javadoc
        * Javadoc is a Java development package used
        * for creating an HTML document with all methods and
        *attributes of the classes contained in your project.
        To create this HTML document you need to execute a command in the terminal,
        from the directory containing the source files, execute the command:
    
            javadoc -d dirDoc packagename
        */


