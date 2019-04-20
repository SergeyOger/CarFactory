package com.interiorcreator;

import com.interfaces.IGetDetailsDescription;

import java.io.Serializable;

public abstract class Interior implements IGetDetailsDescription, Serializable {

    public abstract String getSeatsMaterial();

    public abstract String getUpholsteriMaterial();

    public abstract String getDashboardtype();
}
