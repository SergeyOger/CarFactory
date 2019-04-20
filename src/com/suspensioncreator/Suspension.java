package com.suspensioncreator;

import com.interfaces.IGetDetailsDescription;

import java.io.Serializable;

public abstract class Suspension implements IGetDetailsDescription, Serializable {

    public abstract String getComphortLevel();

    public abstract int getClearense();

    public abstract int getSuspensionTreavel();
}

