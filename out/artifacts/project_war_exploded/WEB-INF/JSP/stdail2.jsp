<%--
  Created by IntelliJ IDEA.
  User: kfzjw008
  Date: 2019-07-11
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
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
    <header class="app-header"><a class="app-header__logo" href="index.html" style="font-size:13px">高中学生社团服务管理一体化平台</a>
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
            <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-laptop"></i><span class="app-menu__label">我的社团</span><i class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li><a class="treeview-item" href="wjrd"><i class="icon fa fa-circle-o"></i> 我加入的社团</a></li>
                    <li><a class="treeview-item" href="wgld" ><i class="icon fa fa-circle-o"></i>我管理的社团</a></li>
                </ul>
            </li>

            <li class="treeview"><a class="app-menu__item active" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-edit"></i><span class="app-menu__label">社团列表</span><i class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li><a class="treeview-item" href="quanbushetuan"><i class="icon fa fa-circle-o"></i>全部社团</a></li>
                    <li><a class="treeview-item" href="youxiushetuan"><i class="icon fa fa-circle-o"></i> 优秀社团</a></li>
                    <li><a class="treeview-item" href="buhegeshetuan"><i class="icon fa fa-circle-o"></i> 不合格社团</a></li>
                </ul>
            </li>
            <li><a class="app-menu__item" href="chuangjianshetuan"><i class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">创建社团</span></a></li>

            </li>

            <li><a class="app-menu__item" href="ziliaoxiugai"><i class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">个人中心</span></a></li>
        </ul>
    </aside>
    <main class="app-content">
        <div class="row user">
            <div class="col-md-12">
                <div class="profile">
                    <div class="info"><img class="user-img" src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg">
                        <h4>
                            <Label ID="Label4" runat="server" Text="Label">${shetuan.name}</Label></h4>
                        <p>协会编号：<Label ID="Label3" runat="server" Text="Label">${shetuan.id}</Label></p>
                    </div>
                    <div class="cover-image"></div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="tile p-0">
                    <ul class="nav flex-column nav-tabs user-tabs">
                        <li class="nav-item"><a class="nav-link active" href="#shetuanxinxi" data-toggle="tab">社团信息</a></li>
                        <li class="nav-item"><a class="nav-link" href="#shetuanhuodong" data-toggle="tab">社团活动</a></li>
                        <li class="nav-item"><a class="nav-link" href="#huiyuanmingdan" data-toggle="tab">会员名单</a></li>
                        <li class="nav-item"><a class="nav-link" href="#liuyanban" data-toggle="tab">社团留言板</a></li>
                        <li class="nav-item"><a class="nav-link" href="#gerenxinxi" data-toggle="tab">退出社团</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-9">
                <div class="tab-content">
                    <div class="tab-pane active" id="shetuanxinxi">
                        <div class="tile user-settings">
                            <h4 class="line-head">社团资料</h4>
                            <div>
                                <div class="row mb-4">
                                    <div class="col-md-4">
                                        <label>社团全名：</label>
                                        <p>${shetuan.name}
                                        </p>

                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-md-8 mb-4">
                                        <label>社团简介：</label>
                                        <p>${shetuan.intention}
                                        </p>
                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>社团类别：</label>
                                        <p>${shetuan.item}
                                        </p>
                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>指导教师：</label>
                                        <p>${shetuan.teacher}
                                        </p>
                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>公众号：</label>
                                        <p>${shetuan.wechat}
                                        </p>
                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>负责人联系方式：</label>
                                        <p>${shetuan.telephone}
                                        </p>
                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="shetuanhuodong">
                        <div class="tile shetuanhuodong">
                            <h4 class="line-head">社团活动</h4>
                            <p>将在V2.0版本对各个社团开设活动专栏，敬请期待！以下展示部分优秀社团活动案例。</p>

                                <h5>天文爱好者协会</h5>
                                <p>南田中学天文爱好者协会成立于“蚀彗同现”的1997年3月9日（漠河日全食，海尔-波普彗星回归），已经有二十一年的历史。协会是哈尔滨市天文爱好者协会最早的两家高中分会之一，是哈尔滨天文馆的重点合作单位，是东北高中天文联合会和在哈高中天文联盟的创始成员。在整个东北地区高中天文协会当中具有较大影响力。</p>
                                <p>协会是一个面向全校的科研类兴趣爱好社团，由理学院物理系系主任苏润洲老师担任天文协会固定的指导老师。社团自建立至2017年10月累计有近千名会员，遍布东林的各个学院。社团自成立以来，本着为同学、为社会服务的思想，踏实开展各项工作。</p>
                                <p>协会自建立以来，多次承办哈尔滨市大学生天文知识竞赛，三次承办东北地区大学生天文知识竞赛，并多次在以上赛事中获得团体特等奖，一等奖的成绩。</p>


                        </div>
                    </div>
                    <div class="tab-pane fade" id="huiyuanmingdan">
                        <div class="timeline-post">
                            <h4 class="line-head">会员名单</h4>
                            <div class="col-12 table-responsive">

                                <table class="table table-striped table-bordered table-condensed"  >
                                    <tr>
                                        <th>用户编号</th>
                                        <th>账号</th>
                                        <th>姓名</th>
                                        <th>学院</th>
                                        <th>专业</th>
                                        <th>电话</th>



                                    </tr>

                                    <c:forEach items="${users}" var="u">
                                        <tr>
                                            <td>${u.id }</td>
                                            <td>${u.userName}</td>
                                            <td>${u.name }</td>
                                            <td>${u.college }</td>
                                            <td>${u.zhuanye }</td>
                                            <td>${u.mobile }</td>


                                        </tr>
                                    </c:forEach>

                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="liuyanban">
                        <form class="tile user-settings" action="liuyanServlet"  method="post">
                            <h4 class="line-head">发送消息</h4>

                            <p>      <textarea ID="Te2" runat="server" row="4" name="context"  class="form-control col-md-8" type="text" placeholder="输入消息内容" >输入留言内容</textarea>  </p>
                            <button ID="Buton1" Text="发送消息" class="btn btn-primary" type="submit" >发送</button>
                        </form>

                        <c:forEach items="${liuyan}" var="u">
                            <div class="timeline-post">
                                <div class="post-media"><a href="#"><img src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg"></a>
                                    <div class="content">
                                        <h5><a href="#">${u.userform}</a></h5>
                                        <p class="text-muted"><small>${u.time}</small></p>
                                    </div>
                                </div>
                                <div class="post-content">
                                    <p> ${u.context}</p>
                                </div>
                                <ul class="post-utility">
                                    <li class="likes" ><a href="dianzanServlet?uid=${u.id}"  method="post"><i class="fa fa-fw fa-lg fa-thumbs-o-up"></i>${u.goodid}喜欢</a></li>
                                    <li class="shares" ><a href="#"><i class="fa fa-fw fa-lg fa-share"></i>--分享</a></li>
                                    <li class="comments"  ><i class="fa fa-fw fa-lg fa-comment-o"></i> --评论</li>
                                </ul>
                            </div>
                        </c:forEach>

                    </div>
                    <div class="tab-pane fade" id="gerenxinxi">
                        <div class="timeline-post">
                            <h4 class="line-head">退出社团</h4>
                            <form class="jumbotron" action="deleteuserstServlet"  method="post">
                                <h1 class="display-3 ">退出社团</h1>
                                <p>点击按钮将退出社团，一切与该社团相关的个人信息将会被清空，请慎重选择，</p>
                                <Button ID="Button1" runat="server" Text="退出社团" class="btn btn-primary btn-lg btn-danger" type="submit"  >退出社团</Button>
                            </form>
                        </div>
                    </div>
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
