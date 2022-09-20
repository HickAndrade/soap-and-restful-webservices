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

import br.com.hickandrade.bo.EstoqueBO;
import br.com.hickandrade.to.TenisTO;

@Path("/tenis")
public class Resource {
	static EstoqueBO estoqueBo = EstoqueBO.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON) //tipo de informaçao que o RECURSO retorna
	public List<TenisTO> listaTenis() {
		return estoqueBo.lista();
	}
	
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON) // tipo de informaçao que o recurso recebe
	public Response cadastrar(TenisTO tenis, @Context UriInfo uriInfo){
	estoqueBo.cadastrar(tenis);
	UriBuilder builder = uriInfo.getAbsolutePathBuilder();
	builder.path(Integer.toString(tenis.getCodigo()));
	return Response.created(builder.build()).build();
	}
	
	
	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TenisTO buscar(@PathParam("id") int codigo){
	return estoqueBo.buscar(codigo);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Atualizar (TenisTO tenis, @PathParam("id") int codigo) {
		tenis.setCodigo(codigo);
		estoqueBo.atualiza(tenis);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	public void Remove(@PathParam("id") int codigo) {
		estoqueBo.remover(codigo);
	}
	
	
}
