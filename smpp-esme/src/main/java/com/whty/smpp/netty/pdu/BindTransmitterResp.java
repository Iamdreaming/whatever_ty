package com.whty.smpp.netty.pdu;

import com.whty.smpp.netty.constants.SmppConstants;

/*
 * #%L
 * ch-smpp
 * %%
 * Copyright (C) 2009 - 2015 Cloudhopper by Twitter
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


public class BindTransmitterResp extends BaseBindResp {

    public BindTransmitterResp() {
        super(SmppConstants.CMD_ID_BIND_TRANSMITTER_RESP, "bind_transmitter_resp");
    }
    
}