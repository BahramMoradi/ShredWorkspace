using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(FirstASP.Startup))]
namespace FirstASP
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
