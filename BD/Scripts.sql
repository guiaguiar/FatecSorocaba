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
			RG          varchar2(15)       NOT NULL,
			Email       varchar2(40)       UNIQUE,
			CONSTRAINT pk_CPF PRIMARY KEY(CPF)	);


CREATE TABLE Instrutor ( 	CPFInstrutor varchar2(17) NOT NULL,
            Formacao    varchar2(30),
			AreaAtuacao varchar2(30)       NOT NULL,
			CONSTRAINT pk_CPFInstrutor PRIMARY KEY (CPFInstrutor)	);

CREATE TABLE Aluno (	CPFAluno varchar2(17) NOT NULL,
			Escolaridade varchar2(30),
			CONSTRAINT pk_CPFAluno PRIMARY KEY(CPFAluno));

CREATE TABLE Matricula (	CPFAluno varchar2(17) NOT NULL,
            SiglaTurma    varchar2(4)        NOT NULL,
            DataMatricula varchar2(16),
            QtdeFaltas    number(7),
            Nota          number(4,2),
            CONSTRAINT pk_CPFAlunoMatricula PRIMARY KEY(CPFAluno));

CREATE TABLE APrazo (	CodPagamento number(9) NOT NULL,
            CPFMatricula    varchar2(17)     NOT NULL,
            Valor           number(7,2),
			DtVencimento    varchar2(7),
			TaxaJuros       number(7,2),
			QtdeMensalidade number(7),
            CONSTRAINT pk_CodPagamentoAPrazo PRIMARY KEY(CodPagamento));

CREATE TABLE AVista (	CodPagamento number(9) NOT NULL,
            CPFMatricula varchar2(17) NOT NULL,
            Valor        number(7,2),
			Agencia      number(7),
			NCheques     number(7),
			PreData      varchar2(16),
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

/*######################################################################################
###############################  Cardinalidades ########################################## */
ALTER TABLE Instrutor ADD (	CONSTRAINT fk_InstrutorPessoa FOREIGN KEY (CPFInstrutor)
				REFERENCES Pessoa (CPF) ON DELETE CASCADE);

ALTER TABLE Aluno ADD (	CONSTRAINT fk_AlunoPessoa FOREIGN KEY (CPFAluno)
				REFERENCES Pessoa (CPF) ON DELETE CASCADE); 

ALTER TABLE Matricula ADD (	CONSTRAINT fk_CpfAlunoMatricula FOREIGN KEY (CPFAluno)
				REFERENCES Aluno (CPFAluno) ON DELETE CASCADE);
            
ALTER TABLE Matricula ADD (	CONSTRAINT fk_SiglaTurmaMatricula FOREIGN KEY (SiglaTurma)
				REFERENCES Turma (SiglaTurma) ON DELETE CASCADE);
                
ALTER TABLE APrazo ADD (	CONSTRAINT fk_CPFMatriculaPrazo FOREIGN KEY (CPFMatricula)
				REFERENCES Matricula (CPFAluno) ON DELETE CASCADE);

ALTER TABLE AVista ADD (	CONSTRAINT fk_CPFMatriculaVista FOREIGN KEY (CPFMatricula)
				REFERENCES Matricula (CPFAluno) ON DELETE CASCADE);
                
ALTER TABLE Turma ADD (	CONSTRAINT fk_CPFInstrutorTurma FOREIGN KEY (CPFInstrutor)
				REFERENCES Instrutor (CPFInstrutor) ON DELETE CASCADE);

ALTER TABLE Turma ADD (	CONSTRAINT fk_SiglaCursoTurma FOREIGN KEY (SiglaCurso)
				REFERENCES Curso (SiglaCurso) ON DELETE CASCADE);
                
INSERT INTO Pessoa VALUES('163.088.136-80','Leonardo Bernardo Moreira','07/03/1996','Rua G','981','Jardim Primavera',
                        'Coronel Fabriciano','MG','35172-318','(31) 2736-7401','(31) 99100-7683',
                        'M','Solteiro','46.415.765-1','lleonardobernardo@hotmail.com');
                        
INSERT INTO Pessoa VALUES('157.302.978-58','Marina Joana Rodrigues','24/06/1996','Rua Rúbens Antônio Nazaré Santos','681','Vila Rica',
                        'Sorocaba','SP','18052-340','(15) 3672-1465','(15) 98386-3152',
                        'F','Divorciada','10.764.735-7','marinajoana@mv1.com');
                        
INSERT INTO Pessoa VALUES('151.839.458-29','Letícia Antônia Malu Nunes','20/08/1997','Rua Sessenta','538','Parque São Bento',
                        'Sorocaba','SP','18072-670','(15) 3896-1759','(15) 99239-1779',
                        'F','Solteiro','38.321.165-7','antoniamalununes@molsa.com');
                        
INSERT INTO Pessoa VALUES('163.088.136-80','Leonardo Bernardo Moreira','07/03/1996','Rua G','981','Jardim Primavera',
                        'Coronel Fabriciano','MG','35172-318','(31) 2736-7401','(31) 99100-7683',
                        'M','Solteiro','46.415.765-1','lleonardobernardo@hotmail.com');
                        
INSERT INTO Pessoa VALUES('163.088.136-80','Leonardo Bernardo Moreira','07/03/1996','Rua G','981','Jardim Primavera',
                        'Coronel Fabriciano','MG','35172-318','(31) 2736-7401','(31) 99100-7683',
                        'M','Solteiro','46.415.765-1','lleonardobernardo@hotmail.com');
                