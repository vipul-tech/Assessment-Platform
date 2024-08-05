import { React } from "react";
import { Link, useNavigate } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

const AdminHeader = () => {
  let navigate = useNavigate();

  const user = JSON.parse(sessionStorage.getItem("active-admin"));
  console.log(user);

  const adminLogout = () => {
    toast.success("Logged out!!!", {
      position: "top-center",
      autoClose: 1000,
      hideProgressBar: false,
      closeOnClick: true,
      pauseOnHover: true,
      draggable: true,
      progress: undefined,
    });
    sessionStorage.removeItem("active-admin");
    sessionStorage.removeItem("admin_jwtToken");
     setTimeout(() => {
      window.location.href = "/home";
     }, 2000);
  };

  return (
    <ul class="navbar-nav ms-auto mb-2 mb-lg-0 me-5">
      <li class="nav-item dropdown">
        <Link to="/admin/" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
       <b className="text-danger">Grade</b>
      </Link>
      <ul class="dropdown-menu dropdown-menu-dark bg-danger p-2 text-danger bg-opacity-50">
        <li><Link className="dropdown-item text-danger" to="/admin/grade/add" ><b>Add Grade</b></Link></li>
        <li><Link className="dropdown-item text-danger" to="/admin/grade/all" ><b>View Grade</b></Link></li>
      </ul>
    </li>

<li class="nav-item dropdown">
  <Link to="/admin/" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false" >
       <b className="text-danger">Course</b>
      </Link>
      <ul class="dropdown-menu dropdown-menu-dark bg-danger p-2 text-danger bg-opacity-50">
        <li><Link className="dropdown-item text-danger" to="/admin/course/add" ><b>Add Course</b></Link></li>
        <li><Link className="dropdown-item text-danger" to="/admin/grade/all/course/" ><b>View Course</b></Link></li>
      </ul>
    </li>

<li class="nav-item dropdown">
  <Link to="/admin/" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
       <b className="text-danger">Teacher</b>
      </Link>
      <ul class="dropdown-menu dropdown-menu-dark bg-danger p-2 text-danger bg-opacity-50">
        <li><Link className="dropdown-item text-danger" to="/user/teacher/register"><b>Register Teacher</b></Link></li>
        <li><Link className="dropdown-item text-danger" to="/admin/teacher/all"><b>View Teachers</b></Link></li>
      </ul>
    </li>

<li class="nav-item dropdown">
  <Link to="/admin/" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
       <b className="text-danger">Exams</b>
      </Link>
      <ul class="dropdown-menu dropdown-menu-dark bg-danger p-2 text-danger bg-opacity-50">
        <li><Link className="dropdown-item text-danger" to="/exam/all/"><b>All Exams</b></Link></li>
        <li><Link className="dropdown-item text-danger" to="/exam/all/student/result/"><b>Exam Results</b></Link></li>
      </ul>
    </li>
<li class="nav-item">
    <Link
      to="/admin/student/all"
      class="nav-link active"
      aria-current="page"
    >
      <b className="text-danger">View Students</b>
    </Link>
  </li>

  <li class="nav-item">
    <Link
      to=""
      class="nav-link active"
      aria-current="page"
      onClick={adminLogout}
    >
      <b className="text-danger">Logout</b>
    </Link>
    <ToastContainer />
  </li>
  </ul>
  );
};

export default AdminHeader;
