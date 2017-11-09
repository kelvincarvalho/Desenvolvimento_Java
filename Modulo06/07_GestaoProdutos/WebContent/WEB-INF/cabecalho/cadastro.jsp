<div class="container">
	<div class="margem">
		<h2>Cadastro de Produtos</h2>
	</div>
	<section>
		<div class="row">
			<form action="produto" method="post">
				<div class="col-md-6">
					<div id="mensagemdb"></div>

					<div class="form-group row">
						<label for="codico" class="col-sm-3 col-form-label"> C�digo:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="codigo" name="codigo">
						</div>
					</div>

					<div class="form-group row">
						<label for="descricao" class="col-sm-3 col-form-label"> Descri��o:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="descricao" name="descricao" />

						</div>
					</div>

					<div class="form-group row">
						<label for="preco" class="col-sm-3 col-form-label"> Pre�o:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="preco" name="preco"/>
						</div>
					</div>

					<div class="form-group row">
						<label for="fabricante" class="col-sm-3 col-form-label">
							Fabricante:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="fabricante"
								name="fabricante">
						</div>
					</div>

					<div class="form-group row">
						<div class="col-sm-3">
							<button type="button" id="btnEnviar" onclick="submit();" class="btn btn-info">
								<span class="glyphicon glyphicon-pencil"></span> Enviar
							</button>
						</div>
						<div id="mensagemdb">
							${mensagem}
						</div>
					</div>
				</div>
			</form>
		</div>
	</section>
	<br><br>
	
	
</div>
