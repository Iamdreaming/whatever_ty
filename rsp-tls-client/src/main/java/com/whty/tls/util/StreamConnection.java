package com.whty.tls.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract interface StreamConnection
{
  public abstract DataInputStream openDataInputStream()
    throws IOException;
  
  public abstract DataOutputStream openDataOutputStream()
    throws IOException;
  
  public abstract void disConnect()
    throws IOException;
}