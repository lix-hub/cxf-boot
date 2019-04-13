package com.xxzos.boot.services;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.xxzos.boot.vo.TemplateVO; 

@Path("/templateService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ITemplateService {

	@GET
	@Path("/get/{name}")
	public String testGet(@PathParam("name")String name);
	@GET
	@Path("/find")
	public List<TemplateVO> findTemplate(@QueryParam("")TemplateVO templateVO);
	@GET
	@Path("/findOne/{id}")
	public TemplateVO findOneTemplate(@PathParam("id") Long id);
}
