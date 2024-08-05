import { Link, useNavigate } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

const HeaderTeacher = () => {
  let navigate = useNavigate();

  const teacher = JSON.parse(sessionStorage.getItem("active-teacher"));

  const userLogout = () => {
    toast.success("Logged out!!!", {
      position: "top-center",
      autoClose: 1000,
      hideProgressBar: false,
      closeOnClick: true,
      pauseOnHover: true,
      draggable: true,
      progress: undefined,
    });
    sessionStorage.removeItem("active-teacher");
    sessionStorage.removeItem("teacher-jwtToken");
    setTimeout(() => {
      window.location.href = "/home";
    }, 2000); // Redirect after 3 seconds
  };

  const viewProfile = () => {
    navigate("/user/profile/detail", { state: teacher });
  };

  return (
    <ul class="navbar-nav ms-auto mb-2 mb-lg-0 me-5">
        <li class="nav-item dropdown">
			<Link to="/" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				<b className="text-danger">Student</b>
			</Link>
			<ul class="dropdown-menu dropdown-menu-dark bg-danger p-2 text-danger bg-opacity-50">
				<li><Link className="dropdown-item text-danger" to="/user/student/register" ><b>Register Student</b></Link></li>
				<li><Link className="dropdown-item text-danger" to="/teacher/grade/student/all"><b>View Students</b></Link></li>
				<li><Link className="dropdown-item text-danger" to="/exam/grade/student/result/"><b>Student Results</b></Link></li>
			</ul>
		</li>
		
		<li class="nav-item dropdown">
			<Link to="/" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				<b className="text-danger">Grade</b>
			</Link>
			<ul class="dropdown-menu dropdown-menu-dark bg-danger p-2 text-danger bg-opacity-50">
				<li><Link className="dropdown-item text-danger" to="/exam/add"><b>Add Exam</b></Link></li>
				<li><Link className="dropdown-item text-danger" to="/exam/grade-wise/upcoming"><b>Upcoming Exams</b></Link></li>
				<li><Link className="dropdown-item text-danger" to="/exam/grade-wise/previous"><b>Previous Exams</b></Link></li>
			</ul>
		</li>
		
		
      {teacher && teacher.grade && (<li className="nav-item">
        <Link
          to={`/admin/grade/${teacher.grade.id}/course/`}
          className="nav-link active"
          aria-current="page"
        >
          <b className="text-danger">View Courses</b>
        </Link>
      </li>
  )}
      <li class="nav-item">
        <div class="nav-link active" aria-current="page">
          <b className="text-danger" onClick={viewProfile}>
            My Profile
          </b>
          <ToastContainer />
        </div>
      </li>
      <li class="nav-item">
        <Link
          to=""
          class="nav-link active"
          aria-current="page"
          onClick={userLogout}
          navigate 
        >
          <b className="text-danger">Logout</b>
        </Link>
        <ToastContainer />
      </li>
      </ul>
  );
};

export default HeaderTeacher;
