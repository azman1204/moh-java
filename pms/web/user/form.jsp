<%@include file="../include/header.jsp" %>

<legend>Daftar Pengguna Sistem</legend>
<form method="post" action="/pms/user?act=insert">
    <div class="row">
        <div class="col-md-1">Name</div>
        <div class="col-md-4"><input type="text" name="name" class="form-control"></div>
    </div>
    <div class="row">
        <div class="col-md-1">Password</div>
        <div class="col-md-4"><input type="password" name="pwd" class="form-control"></div>
    </div>
    <div class="row">
        <div class="col-md-1">Role</div>
        <div class="col-md-4">
            <select name="role" class="form-control">
                <option value="1">Admin</option>
                <option value="2">Pengguna</option>
            </select>
        </div>
    </div>
    <div class="row">
        <div class="col-md-1">Jantina</div>
        <div class="col-md-4">
            <input type="radio" name="gender" value="L"> Lelaki 
            <input type="radio" name="gender" value="P"> Perempuan 
        </div>
    </div>
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-4"><input type="submit" value="Save" class="btn btn-primary"></div>
    </div>
</form>


<%@include file="../include/footer.jsp" %>