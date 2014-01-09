package org.poc.oval;

import net.sf.oval.configuration.annotation.IsInvariant;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotNull;

public class BusinessObject
{
	
	
  private String name = null;

  public BusinessObject(String name) {

	  this.name = name;
  }
  
  
  @IsInvariant
  @NotNull 
  @Length(max = 4)
  public String getName() 
  {
    return name;
  }
  
}
