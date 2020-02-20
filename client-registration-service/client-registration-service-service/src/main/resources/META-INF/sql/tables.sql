create table client (
	clienteId LONG not null primary key,
	planoId LONG,
	nome VARCHAR(75) null,
	rg VARCHAR(75) null,
	nomeMae VARCHAR(75) null,
	nomePai VARCHAR(75) null,
	orgaoExpedidor VARCHAR(75) null,
	estado VARCHAR(75) null,
	dataExpedicao DATE null
);