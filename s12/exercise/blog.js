function loadBlog(page,append){
    $.ajax({
        type:"GET",
        URL:'http://localhost:8080/api/blog?page=${page ? page : "0"}',
        Headers: {
            "Content-Type": "application/json",
        },
        success: function(data){
            renderBlog(data.content,append);
            renderLoadMoreButton(data);
        },
        Error: function(Error){
            console.log(Error);
        },
    });
}

$(document).ready(function(){
loadBlog();
});
function renderBlog(blogs,append){
    let elements = "";
    for(let blog of blogs){
        elements += `
        <div class="card" style="width: 18rem;">
         <img src="${blog.img}" class="card-img-top" alt="...">
            <div class="card-body">
         <h5 class="card-title">${blog.tittle}</h5>
            <p class="card-text">${blog.content}</p>
            <a href="#" class="btn btn-primary">Add New</a>
        </div>
        </div>
        `;
    }
    if(append){
        $("#listBlogs").append(elements);
    }else{
        $("#listBlogs").html(elements);
    }
}

function loadMore(nextPage){
    loadBlog(nextPage,true);
}
function renderLoadMoreButton(blogPageData){
if(blogPageData.number < blogPageData.totalPages-1){
    $("#loadMoreContainer").html(
        `
        <button type="button" class="btn btn-dark"
         onclick="loadMore(${blogPageData.number + 1})">
         Xem thêm</button>
         `
    );
}else{
    $("#loadMoreContainer").remove();
}
}