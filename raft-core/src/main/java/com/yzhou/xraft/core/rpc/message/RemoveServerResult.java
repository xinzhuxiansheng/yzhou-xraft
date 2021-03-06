package com.yzhou.xraft.core.rpc.message;

import com.yzhou.xraft.core.node.NodeEndpoint;

public class RemoveServerResult {

    private final GroupConfigChangeStatus status;
    private final NodeEndpoint leaderHint;

    public RemoveServerResult(GroupConfigChangeStatus status, NodeEndpoint leaderHint) {
        this.status = status;
        this.leaderHint = leaderHint;
    }

    public GroupConfigChangeStatus getStatus() {
        return status;
    }

    public NodeEndpoint getLeaderHint() {
        return leaderHint;
    }

    @Override
    public String toString() {
        return "RemoveServerResult{" +
                "status=" + status +
                ", leaderHint=" + leaderHint +
                '}';
    }

}
