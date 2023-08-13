<%--
  Created by IntelliJ IDEA.
  User: kfzjw008
  Date: 2019-07-09
  Time: 1:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <c:url value="/" var="basepath"></c:url>
    <base href="${basepath }">

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular."/>
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image"/>
    <meta property="twitter:site" content="@pratikborsadiya"/>
    <meta property="twitter:creator" content="@pratikborsadiya"/>
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website"/>
    <meta property="og:site_name" content="Vali Admin"/>
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme"/>
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin"/>
    <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png"/>
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular."/>

    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="../../sources/css/main.css"/>
    <link rel="stylsheet" type="text/ss" href="../../sources/css/all.css"/>
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <title>高中学生社团服务管理一体化平台</title>
</head>
<body class="app sidebar-mini rtl">
<div id="form1" runat="server">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="home" style="font-size:13px">高中学生社团服务管理一体化平台</a>
        <a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
        <!-- Navbar Right Menu-->
        <ul class="app-nav">
            <li class="app-search">
                <input class="app-search__input" type="search" placeholder="查找">
                <button class="app-search__button"><i class="fa fa-search"></i></button>
            </li>
            <!--Notification Menu-->
            <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Show notifications"><i class="fa fa-bell-o fa-lg"></i></a>
                <ul class="app-notification dropdown-menu dropdown-menu-right">
                    <li class="app-notification__title">你有 3 条未读消息</li>
                    <div class="app-notification__content">
                        <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-primary"></i><i class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
                            <div>
                                <p class="app-notification__message">来自  社团联合会 的消息</p>
                                <p class="app-notification__meta">2天以前</p>
                            </div></a></li>
                        <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-danger"></i><i class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
                            <div>
                                <p class="app-notification__message">来自 社团联合会 的文件</p>
                                <p class="app-notification__meta">5天以前</p>
                            </div></a></li>
                        <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-success"></i><i class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
                            <div>
                                <p class="app-notification__message">来自 校团委 的公告</p>
                                <p class="app-notification__meta">7天以前</p>
                            </div></a></li>

                    </div>
                    <li class="app-notification__footer"><a href="#">忽略全部</a></li>
                </ul>
            </li>
            <!-- User Menu-->
            <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
                <ul class="dropdown-menu settings-menu dropdown-menu-right">
                    <li><a class="dropdown-item" href="ziliaoxiugai"><i class="fa fa-cog fa-lg"></i> 设置</a></li>
                    <li><a class="dropdown-item" href="ziliaoxiugai"><i class="fa fa-user fa-lg"></i>我的资料</a></li>
                    <li><a class="dropdown-item" href="index"><i class="fa fa-sign-out fa-lg"></i> 退出</a></li>
                </ul>
            </li>
        </ul>
    </header>
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
        <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg" alt="User Image">
            <div>
                <p class="app-sidebar__user-name"><Label ID="Label1">${username}</Label></p>
                <p class="app-sidebar__user-designation"><Label ID="Label2">${userxh}</Label></p>
            </div>
        </div>
        <ul class="app-menu">
            <li><a class="app-menu__item " href="home"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">首页</span></a></li>
            <li><a class="app-menu__item" href="tzgg"><i class="app-menu__icon fa fa-pie-chart"></i><span class="app-menu__label">通知公告</span></a></li>
            <li class="treeview"><a class="app-menu__item active" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-laptop"></i><span class="app-menu__label">我的社团</span><i class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li><a class="treeview-item" href="wjrd"><i class="icon fa fa-circle-o"></i> 我加入的社团</a></li>
                    <li><a class="treeview-item" href="wgld" ><i class="icon fa fa-circle-o"></i>我管理的社团</a></li>

                </ul>
            </li>

            <li class="treeview"><a class="app-menu__item " href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-edit"></i><span class="app-menu__label">社团列表</span><i class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li><a class="treeview-item" href="quanbushetuan"><i class="icon fa fa-circle-o"></i>全部社团</a></li>
                    <li><a class="treeview-item" href="youxiushetuan"><i class="icon fa fa-circle-o"></i> 优秀社团</a></li>
                    <li><a class="treeview-item" href="buhegeshetuan"><i class="icon fa fa-circle-o"></i> 不合格社团</a></li>
                </ul>
            </li>
            <li><a class="app-menu__item  " href="chuangjianshetuan"><i class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">创建社团</span></a></li>

            </li>

            <li><a class="app-menu__item" href="ziliaoxiugai"><i class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">个人中心</span></a></li>
        </ul>
    </aside>
    <main class="app-content">
        <div class="app-title">
            <div>
                <h1><i class="fa fa-dashboard"></i> 我加入的社团</h1>
                <p>这里显示已经加入的社团，留空为空</p>
            </div>
            <ul class="app-breadcrumb breadcrumb">
                <li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
                <li class="breadcrumb-item"><a href="#">首页</a></li>
            </ul>
        </div>

        <div class="row" >
            <div class="tile">
                <div class="col-12 table-responsive">
                    <table class="table table-striped table-bordered table-condensed"  >
                        <tr>
                            <th>社团编号</th>
                            <th>社团名称</th>

                            <th>指导教师</th>
                            <th>社团类别</th>
                            <th>联系方式</th>
                            <th>详情</th>

                        </tr>

                        <c:forEach items="${shetuan}" var="u">
                            <tr>
                                <td>${u.id }</td>
                                <td>${u.name }</td>
                                <td>${u.teacher }</td>
                                <td>${u.item }</td>

                                <td>${u.telephone }</td>

                                <td><a href="stdetail2Servlet?uid=${u.id}">详情</a></td>
                            </tr>
                        </c:forEach>

                    </table>
                </div>
            </div>
        </div>

    </main>
    <!-- Essential javascripts for application to work-->
    <script src="../../sources/js/jquery-3.2.1.min.js"></script>
    <script src="../../sources/js/popper.min.js"></script>
    <script src="../../sources/js/bootstrap.min.js"></script>
    <script src="../../sources/js/main.js"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="../../sources/js/plugins/pace.min.js"></script>
    <!-- Page specific javascripts-->
    <script type="text/javascript" src="../../sources/js/plugins/chart.js"></script>


</div>
</body>
</html>
