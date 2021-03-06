/**
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 * <p/>
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.github.adminfaces.addon.ui;

import javax.inject.Inject;

import org.jboss.forge.addon.facets.constraints.FacetConstraint;
import org.jboss.forge.addon.projects.ProjectFactory;
import org.jboss.forge.addon.projects.ui.AbstractProjectCommand;
import org.jboss.forge.addon.ui.context.UIBuilder;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.context.UIExecutionContext;
import org.jboss.forge.addon.ui.metadata.UICommandMetadata;
import org.jboss.forge.addon.ui.result.Result;
import org.jboss.forge.addon.ui.result.Results;
import org.jboss.forge.addon.ui.util.Categories;
import org.jboss.forge.addon.ui.util.Metadata;

import com.github.adminfaces.addon.facet.AdminFacet;

/**
 * Swagger: Generate command
 *
 * @author <a href="rmpestano@gmail.com">Rafael Pestano</a>
 */
@FacetConstraint({ AdminFacet.class })
public class AdminScaffoldCommand extends AbstractProjectCommand {

	@Inject
	private ProjectFactory projectFactory;
	
	@Override
	public UICommandMetadata getMetadata(UIContext context) {
		return Metadata.forCommand(AdminScaffoldCommand.class).name("Swagger: Generate")
				.category(Categories.create("Swagger")).description(
						"Generate Swagger spec files (in /target/resourcesDir) for JAX-RS endpoints in the current project");
	}

	@Override
	public void initializeUI(UIBuilder uiBuilder) throws Exception {

	}

	@Override
	public Result execute(UIExecutionContext context) {
		//getSelectedProject(context).getFacet(AdminFacet.class).generateSwaggerResources();
		return Results.success("Swagger generate command executed successfuly!");
	}

	@Override
	protected ProjectFactory getProjectFactory() {
		return projectFactory;
	}

	@Override
	protected boolean isProjectRequired() {
		return true;
	}

}
