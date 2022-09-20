package br.com.hickandrade.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.hickandrade.bo.BiqueiraBO;
import br.com.hickandrade.to.BiqueiraTO;


@Path("/biqueira")
public class biqueiraResource {
	
		 static BiqueiraBO biqueiraBo = BiqueiraBO.getInstance();
		
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<BiqueiraTO> lista(){
			return biqueiraBo.lista();
		}
		
		
		@GET
		@Path("/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public BiqueiraTO procurarPorID(@PathParam("id")int codigo) {
			return biqueiraBo.consultar(codigo);
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response cadastrar(BiqueiraTO biqueira,@Context UriInfo u) {
			biqueiraBo.cadastrar(biqueira);
			UriBuilder builder = u.getAbsolutePathBuilder();
			builder.path(Integer.toString(biqueira.getCodigo()));
			return Response.created(builder.build()).build();
		}

		@PUT
		@Path("{id}")
		@Consumes(MediaType.APPLICATION_JSON)
		public Response Atualizar(BiqueiraTO biqueira, @PathParam("id") int codigo) {
			biqueira.setCodigo(codigo);
			biqueiraBo.atualizar(biqueira);
			return Response.ok().build();
		}

		
		@DELETE
		@Path("/{id}")
		public void Deletar(@PathParam("id") int codigo) {
			biqueiraBo.deletar(codigo);
		}

}
