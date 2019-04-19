package com.interiorcreator;

import java.io.Serializable;

public abstract class Interior implements Serializable {

    public abstract String getSeatsMaterial();

    public abstract String getUpholsteriMaterial();

    public abstract String getDashboardtype();
}
