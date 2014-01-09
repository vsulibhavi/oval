package org.poc.oval;

import net.sf.oval.configuration.annotation.IsInvariant;
import net.sf.oval.constraint.Assert;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotNull;

public class BusinessObject
{
		
  private String name = null;
  private String deliveryAddress = null;
  private String invoiceAddress = "Bangalore";
  
  
//mailingAddress must either be the delivery address or the invoice address 
@Assert(expr = "_value ==_this.deliveryAddress || _value == _this.invoiceAddress", lang = "groovy")
public String mailingAddress;

public String getMailingAddress() {
	return mailingAddress;
}

public void setMailingAddress(String mailingAddress) {
	this.mailingAddress = mailingAddress;
}

public BusinessObject() {

  }
  
public void setName(String name) {
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
