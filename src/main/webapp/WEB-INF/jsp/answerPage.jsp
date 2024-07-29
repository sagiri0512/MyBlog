<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sagiri</title>
    <link href="https://sagirinoinu.top/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
    <script src="https://sagirinoinu.top/js/jquery-3.7.1.js"></script>
    <!-- 包括所有已编译的插件 -->
    <script src="https://sagirinoinu.top/js/bootstrap.min.js"></script>
    <style>
        html, body {
            height: 100%; /* 确保 HTML 和 body 高度为 100% */
            margin: 0; /* 去除默认的边距 */
            padding: 0; /* 去除默认的内边距 */
        }
        body {
            background-image: url('https://sagirinoinu.top/img/sagiri2.png');
            background-size: cover; /* 使背景图像覆盖整个屏幕 */
            background-position: center; /* 使背景图像居中 */
            background-repeat: no-repeat; /* 避免图像重复 */
            font-family: 'Arial', sans-serif; /* 更改字体 */
            color: #333; /* 设置默认字体颜色 */
            display: flex;
            flex-direction: column; /* 垂直排列内容 */
        }
        /* 美化导航栏 */
        nav {
            background-color: rgba(0, 0, 255, 0.3); /* 半透明蓝色背景 */
            color: #fff;
            padding: 15px 30px;
            position: fixed;
            width: 100%;
            top: 0;
            left: 0;
            z-index: 1000; /* 确保导航栏在其他内容之上 */
            display: flex;
            align-items: center;
            justify-content: space-between; /* 左右对齐导航项和标题 */
        }
        nav a {
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            margin: 0 10px;
            border-radius: 5px; /* 添加圆角效果 */
            transition: background-color 0.3s; /* 添加过渡效果 */
        }
        nav a:hover {
            background-color: rgba(0, 0, 255, 0.5); /* 半透明蓝色背景 */
        }
        nav h1 {
            color: #fff; /* 确保标题文字颜色适合背景 */
            font-size: 1.5rem; /* 调整标题字体大小 */
            margin: 0; /* 去除默认的外边距 */
        }
        .container {
            flex: 1; /* 使容器占据剩余空间 */
            padding: 20px;
            margin-top: 80px; /* 为导航栏预留空间 */
            text-align: center; /* 将内容居中对齐 */
            color: #4b0082; /* 设置副标题颜色 */
            overflow: hidden; /* 隐藏超出容器的内容 */
        }
        .answer {
            white-space: pre-wrap; /* 保留换行符和空格 */
            background-color: rgba(255, 255, 255, 0.8); /* 半透明背景 */
            border-radius: 10px; /* 圆角效果 */
            padding: 10px; /* 减少内边距 */
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); /* 添加阴影效果 */
            max-width: 800px; /* 限制最大宽度 */
            max-height: 500px; /* 限制最大高度 */
            margin: 0 auto; /* 居中对齐 */
            text-align: left; /* 确保文本左对齐 */
            overflow-y: auto; /* 允许垂直滚动 */
        }
        /* 响应式设计 */
        @media (max-width: 768px) {
            nav {
                flex-direction: column; /* 在小屏幕上，导航栏内容纵向排列 */
                align-items: flex-start;
            }
            nav h1 {
                margin-bottom: 10px; /* 标题与导航链接之间的间距 */
            }
            nav a {
                display: block;
                margin: 5px 0;
            }
            .container {
                padding-top: 60px;
            }
        }
    </style>
</head>
<body>
<nav>
    <h1 class="text-center">Sagiri's Blog</h1>
    <div>
        <a href="/blog/index/index">首页</a>
        <a href="/blog/common/common">常用</a>
        <a href="https://github.com/sagiri0512">仓库</a>
        <a href="/blog/myProject/myProject">项目</a>
    </div>
</nav>
<div class="container">
    <h2>${result.data.problem}</h2>
    <div class="answer"><c:out value="${result.data.answer}" />
    </div>
</div>
</body>

</html>
