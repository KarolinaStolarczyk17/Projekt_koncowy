<%--
  Created by IntelliJ IDEA.
  User: karolina
  Date: 17.10.2021
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html; charset=UTF-8" %>--%>

<%--<h2><a href="clientsForm/list"> Klienci  </a> </h2>--%>
<%--<h2><a href="insurances/list"> Polisy  </a> </h2>--%>
<%--<h2><a href="users/list"> Użytkownicy  </a> </h2>--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl-PL">

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="../../theme/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="..">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-laugh-wink"></i>
            </div>
            <div class="sidebar-brand-text mx-3">Agency</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="..">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Home</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="../clientsForm/list">
                <i class="fas fa-fw fa-table"></i>
                <span>Klienci</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="../insuranceForm/list">
                <i class="fas fa-fw fa-table"></i>
                <span>Polisy</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="../userForm/list">
                <i class="fas fa-fw fa-table"></i>
                <span>Użytkownicy</span></a>
        </li>


    </ul>
</div>