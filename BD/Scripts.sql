CREATE TABLE Pessoa (	CPF varchar2(17),
            Nome        varchar2(30)       NOT NULL, 
			DataNasc    date               NOT NULL, 
			Endereco    varchar2(30)       NOT NULL,
			Numero      number(7)          NOT NULL,
			Bairro      varchar2(30)       NOT NULL,
			Cidade      varchar2(30)       NOT NULL,
			Estado      varchar2(30),
			CEP         varchar2(15)       NOT NULL,
			Telefone    varchar2(15),
			Celular     varchar2(15),
			Sexo        varchar2(1)        CHECK (Sexo IN ('M','F')),
			EstadoCivil varchar2(10),
			RG          varchar2(15)       NOT NULL 	UNIQUE,
			Email       varchar2(40)       UNIQUE,
			CONSTRAINT pk_CPF PRIMARY KEY(CPF)	);

CREATE TABLE Instrutor ( 	CPFInstrutor varchar2(17) NOT NULL,
            Formacao    varchar2(30),
			AreaAtuacao varchar2(30)       NOT NULL,
			CONSTRAINT pk_CPFInstrutor PRIMARY KEY (CPFInstrutor)	);

CREATE TABLE Aluno (	CPFAluno varchar2(17) NOT NULL,
			Escolaridade varchar2(30)		  NOT NULL,
			CONSTRAINT pk_CPFAluno PRIMARY KEY(CPFAluno));

CREATE TABLE Matricula (	
			CPFAluno 			varchar2(17) 	  NOT NULL,
            SiglaTurma    		varchar2(4)       NOT NULL,
			CodPagamentoVista 	number(9),
			CodPagamentoPrazo 	number(9),
            DataMatricula 		varchar2(16),
            QtdeFaltas    		number(7),
            Nota          		number(4,2),
            CONSTRAINT pk_CPFAlunoMatricula PRIMARY KEY(CPFAluno));

CREATE TABLE APrazo (	
			CodPagamento 	number(9) 		NOT NULL,
            Valor           number(7,2),
			DtVencimento    varchar2(16),
			TaxaJuros       number(7,2),
			QtdeMensalidade number(7),
            CONSTRAINT pk_CodPagamentoAPrazo PRIMARY KEY(CodPagamento));

CREATE TABLE AVista (	
			CodPagamento 	number(9) 		 NOT NULL,
            Valor        	number(7,2),
			Agencia      	number(7),
			NCheques     	number(7),
			PreData      	varchar2(16),
            CONSTRAINT pk_CodPagamentoAVista PRIMARY KEY(CodPagamento));

CREATE TABLE Turma (	SiglaTurma varchar2(4),
            CPFInstrutor varchar2(17),
            SiglaCurso   varchar(4),
			Descricao    varchar2(30),
			DataInicio   varchar2(16),
			DataTermino  varchar2(16),
			Periodo      varchar2(10) CHECK (Periodo IN ('M','T','N')),
			QtdVagas     number(3),
			Observacoes  varchar2(30),
            CONSTRAINT pk_SiglaTurma PRIMARY KEY(SiglaTurma));

CREATE TABLE Curso (	SiglaCurso varchar2(4),
			Nome               varchar2(40),
			CargaHoraria       number(5),
			Valor              number(7,2),
			DataVigencia       varchar2(16),
			ValorHoraInstrutor number(7,2),
			Programa           varchar2(30),
            CONSTRAINT pk_SiglaCurso PRIMARY KEY(SiglaCurso));


ALTER TABLE Instrutor ADD (	CONSTRAINT fk_InstrutorPessoa FOREIGN KEY (CPFInstrutor)
				REFERENCES Pessoa (CPF) ON DELETE CASCADE);

ALTER TABLE Aluno ADD (	CONSTRAINT fk_AlunoPessoa FOREIGN KEY (CPFAluno)
				REFERENCES Pessoa (CPF) ON DELETE CASCADE); 

ALTER TABLE Matricula ADD (	CONSTRAINT fk_CpfAlunoMatricula FOREIGN KEY (CPFAluno)
				REFERENCES Aluno (CPFAluno) ON DELETE CASCADE);
            
ALTER TABLE Matricula ADD (	CONSTRAINT fk_SiglaTurmaMatricula FOREIGN KEY (SiglaTurma)
				REFERENCES Turma (SiglaTurma) ON DELETE CASCADE);

ALTER TABLE Matricula ADD ( 	CONSTRAINT fk_CodPagamentoVista FOREIGN KEY(CodPagamentoVista)
				REFERENCES AVista (CodPagamento) ON DELETE CASCADE);

ALTER TABLE Matricula ADD ( 	CONSTRAINT fk_CodPagamentoPrazo FOREIGN KEY(CodPagamentoPrazo)
				REFERENCES APrazo (CodPagamento) ON DELETE CASCADE);

                
ALTER TABLE Turma ADD (	CONSTRAINT fk_CPFInstrutorTurma FOREIGN KEY (CPFInstrutor)
				REFERENCES Instrutor (CPFInstrutor) ON DELETE CASCADE);

ALTER TABLE Turma ADD (	CONSTRAINT fk_SiglaCursoTurma FOREIGN KEY (SiglaCurso)
				REFERENCES Curso (SiglaCurso) ON DELETE CASCADE);
                