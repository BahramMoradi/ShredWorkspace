using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace FirstASP.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your application description page.";

            return View();
        }

        public ActionResult Contact()
        {
            DateTime dt = DateTime.Now;
            
            ViewBag.Message = "Here is our contact informations ";
            ViewBag.datetime = dt.ToString();

            return View();
        }
    }
}