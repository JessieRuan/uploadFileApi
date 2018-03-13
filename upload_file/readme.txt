{\rtf1\ansi\ansicpg936\cocoartf1561\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww17620\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 This RESTful web service is designed for clients to upload files and retrieve content and metadata of a file.\
\
The following instructions guides you through the setup of this application.\
1. Uncompresss project zip file\
2. Import project as a Maven project\
3. Run as Spring Boot App\
\
The following endpoints are provided for clients to interact with server.\
HttpMethod.GET, "/" It is used to retrieve metadata of all uploaded files.\
HttpMethod.GET, "/file/\{filename\}\'94 It is used to retrieve metadata of a specific file of a given file name.\
HttpMethod.POST, "/file" It is used to upload a file; then metadata of this file (e.g., file name, file size, date uploaded) \
will be stored in an in-memory database, and file itself is stored in the file system (uploadDirectory under current working space)\
\
}