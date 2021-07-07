<%--
  Created by IntelliJ IDEA.
  User: baibing
  Date: 2016/1/21
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="off-sidebar" class="sidebar">
    <div class="sidebar-wrapper">
        <ul class="nav nav-tabs nav-justified">
            <li class="active">
                <a href="#off-users" aria-controls="off-users" role="tab" data-toggle="tab">
                    <i class="ti-comments"></i>
                </a>
            </li>
            <li>
                <a href="#off-favorites" aria-controls="off-favorites" role="tab" data-toggle="tab">
                    <i class="ti-heart"></i>
                </a>
            </li>
            <li>
                <a href="#off-settings" aria-controls="off-settings" role="tab" data-toggle="tab">
                    <i class="ti-settings"></i>
                </a>
            </li>
        </ul>
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="off-users">
            </div>
            <div role="tabpanel" class="tab-pane" id="off-favorites">
            </div>
            <div role="tabpanel" class="tab-pane" id="off-settings">
                <div class="sidebar-content perfect-scrollbar">
                    <h5 class="sidebar-title">General Settings</h5>
                    <ul class="media-list">
                        <li class="media">
                            <div class="padding-10">
                                <div class="display-table-cell">
                                    <input type="checkbox" class="js-switch" checked />
                                </div>
                                <span class="display-table-cell vertical-align-middle padding-left-10">Enable Notifications</span>
                            </div>
                        </li>
                        <li class="media">
                            <div class="padding-10">
                                <div class="display-table-cell">
                                    <input type="checkbox" class="js-switch" />
                                </div>
                                <span class="display-table-cell vertical-align-middle padding-left-10">Show your E-mail</span>
                            </div>
                        </li>
                        <li class="media">
                            <div class="padding-10">
                                <div class="display-table-cell">
                                    <input type="checkbox" class="js-switch" checked />
                                </div>
                                <span class="display-table-cell vertical-align-middle padding-left-10">Show Offline Users</span>
                            </div>
                        </li>
                        <li class="media">
                            <div class="padding-10">
                                <div class="display-table-cell">
                                    <input type="checkbox" class="js-switch" checked />
                                </div>
                                <span class="display-table-cell vertical-align-middle padding-left-10">E-mail Alerts</span>
                            </div>
                        </li>
                        <li class="media">
                            <div class="padding-10">
                                <div class="display-table-cell">
                                    <input type="checkbox" class="js-switch" />
                                </div>
                                <span class="display-table-cell vertical-align-middle padding-left-10">SMS Alerts</span>
                            </div>
                        </li>
                    </ul>
                    <div class="save-options">
                        <button class="btn btn-success">
                            <i class="icon-settings"></i><span>Save Changes</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
