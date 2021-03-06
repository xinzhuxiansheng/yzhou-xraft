package com.yzhou.xraft.core.rpc.message;

import com.yzhou.xraft.core.node.NodeEndpoint;

public class RemoveServerRpc {

    private final NodeEndpoint oldServer;

    public RemoveServerRpc(NodeEndpoint oldServer) {
        this.oldServer = oldServer;
    }

    public NodeEndpoint getOldServer() {
        return oldServer;
    }

    @Override
    public String toString() {
        return "RemoveServerRpc{" +
                "oldServer=" + oldServer +
                '}';
    }

}
