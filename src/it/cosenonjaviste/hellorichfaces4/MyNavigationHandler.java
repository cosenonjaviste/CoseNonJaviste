package it.cosenonjaviste.hellorichfaces4;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

public class MyNavigationHandler extends NavigationHandler
{
	private final NavigationHandler delegate;

	public MyNavigationHandler(NavigationHandler delegate)
	{
		super();
		this.delegate = delegate;
	}

	@Override
	public void handleNavigation(FacesContext fc, String actionMethod, String actionName)
	{
		System.out.println("actionMethod " + actionMethod);
		System.out.println("actionName " + actionName);
		delegate.handleNavigation(fc, actionMethod, actionName);
	}
}
