/*
Copyright 2017, Bernd Prünster <mail@berndpruenster.org>

Licensed under the EUPL, Version 1.1 or - as soon they will be approved by the
European Commission - subsequent versions of the EUPL (the "Licence"); You may
not use this work except in compliance with the Licence. You may obtain a copy
of the Licence at: http://joinup.ec.europa.eu/software/page/eupl

Unless required by applicable law or agreed to in writing, software distributed
under the Licence is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied. See the Licence for the
specific language governing permissions and limitations under the Licence.

This project includes components developed by third parties and provided under
various open source licenses (www.opensource.org).

It is based on the Tor_Onion_Proxy_Library
(github.com/thaliproject/Tor_Onion_Proxy_Library) licensed under the
Apache License, Version 2.0 and also includes software developed by the Tor
Project (www.torproject.org) licensed under the BSD License.
*/
package org.berndpruenster.netlayer.tor.mgmt;

import org.berndpruenster.netlayer.socket.tor.HiddenServiceSocket;

public interface HiddenServiceReadyListener {

  public void onReady(HiddenServiceSocket descriptor);

}