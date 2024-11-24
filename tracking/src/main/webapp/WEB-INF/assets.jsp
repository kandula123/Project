<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Asset Tracking</title>
</head>
<body>
    <h2>Asset List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Asset Name</th>
                <th>Asset Type</th>
                <th>Asset Status</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="asset" items="${assets}">
                <tr>
                    <td>${asset.id}</td>
                    <td>${asset.assetName}</td>
                    <td>${asset.assetType}</td>
                    <td>${asset.assetStatus}</td>
                    <td>
                        <a href="/assets/${asset.id}">View</a>
                        <form action="/assets/${asset.id}" method="post">
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

